package com.example.funfacts.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.funfacts.R
import com.example.funfacts.data.UserDataUiEvents
import com.example.funfacts.ui.AnimalCard
import com.example.funfacts.ui.ButtonComponent
import com.example.funfacts.ui.TextComponent
import com.example.funfacts.ui.TextFieldComponent
import com.example.funfacts.ui.TopBar
import com.example.funfacts.ui.UserInputViewModel

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar("Hi there \uD83D\uDE0A")
            TextComponent(
                textValue = "Let's learn about You!",
                textSize = 24.sp
            )

            Spacer(modifier = Modifier.size(20.dp))
            
            TextComponent(
                textValue = "This app will prepare a details page based on input provided by you",
                textSize = 18.sp
            )
            
            Spacer(modifier = Modifier.size(60.dp))

            TextComponent(textValue = "Name", textSize = 18.sp)
            
            Spacer(modifier = Modifier.size(10.dp))

            TextFieldComponent(
                onTextChanged = {
                    userInputViewModel.onEvent(
                        UserDataUiEvents.UserNameEntered(it)
                    )
                }
            )

            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(textValue = "What do you like", textSize = 18.sp)

            Row (modifier = Modifier.fillMaxWidth()){
              AnimalCard(image = R.drawable.cat, animalSelected = {
                  userInputViewModel.onEvent(
                      UserDataUiEvents.AnimalSelected(it)
                  )

              }, selected = userInputViewModel.uiState.value.animalEntered == "Cat")
                AnimalCard(image = R.drawable.dog, animalSelected = {
                    userInputViewModel.onEvent(
                        UserDataUiEvents.AnimalSelected(it)
                    )

                }, selected = userInputViewModel.uiState.value.animalEntered == "Dog")
            }
            
            Spacer(modifier = Modifier.weight(1f))

            if (userInputViewModel.isValidState()){
                ButtonComponent(
                    gotoDetailsScreen = {

                }

                )
            }



        }

    }



}
