package com.kuzmin.dto

import com.kuzmin.Model.UserModel

data class UserResponseDto(val id : Long, val name: String) {
    companion object {
        fun fromModel(model: UserModel) = UserResponseDto(id = model.id, name = model.username)
    }
}