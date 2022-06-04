package com.example.hellodoctor.core.repository.theme

import com.example.hellodoctor.core.storage.Storage
import com.example.hellodoctor.utils.Theme
import com.example.hellodoctor.utils.fromThemeToInt
import com.example.hellodoctor.utils.toTheme
import javax.inject.Inject


class ThemeRepository @Inject constructor(private val storage: Storage) : ThemeRepo {

    override fun saveAppTheme(theme: Theme) {
        val themeValue = theme.fromThemeToInt()

        storage.setTheme(themeValue)
    }


    override fun getAppTheme(): Theme {
        return storage.getTheme().toTheme()
    }

}