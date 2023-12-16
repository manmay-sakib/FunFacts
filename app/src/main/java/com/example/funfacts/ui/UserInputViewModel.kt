package com.example.funfacts.ui
import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.funfacts.data.UserDataUiEvents
import com.example.funfacts.data.UserInputScreenState
import androidx.compose.runtime.mutableStateOf

class UserInputViewModel: ViewModel() {


    companion object{
        const val TAG = "UserInputViewModel"
    }


    // Default ui state for our screen
    var uiState = mutableStateOf(UserInputScreenState())

    fun onEvent(event: UserDataUiEvents) = when(event){
        is UserDataUiEvents.UserNameEntered -> {
           uiState.value = uiState.value.copy(
               nameEntered = event.name
           )
            Log.d(TAG, "onEvent:UserNameEntered->> ")
            Log.d(TAG, "${uiState.value}")

        }

        is UserDataUiEvents.AnimalSelected -> {
            uiState.value = uiState.value.copy(
                animalEntered = event.animalValue
            )
            Log.d(TAG, "onEvent:AnimalSelected->> ")
            Log.d(TAG, "${uiState.value}")

        }

    }

    fun isValidState(): Boolean{
        return !uiState.value.nameEntered.isNullOrEmpty() && !uiState.value.animalEntered.isNullOrEmpty()
    }

}





