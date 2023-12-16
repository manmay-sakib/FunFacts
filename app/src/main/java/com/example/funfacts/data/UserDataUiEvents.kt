package com.example.funfacts.data

sealed class UserDataUiEvents{
     //Events class
    // Using sealed class bcz there is only two events could possible

        data class UserNameEntered(val name:String) : UserDataUiEvents()
        data class AnimalSelected(val animalValue:String): UserDataUiEvents()

}
