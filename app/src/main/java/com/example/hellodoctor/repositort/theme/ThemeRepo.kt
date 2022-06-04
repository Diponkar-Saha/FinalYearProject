package com.example.hellodoctor.core.repository.theme

import com.example.hellodoctor.utils.Theme



interface ThemeRepo {

    fun saveAppTheme(theme: Theme)

    fun getAppTheme(): Theme

}