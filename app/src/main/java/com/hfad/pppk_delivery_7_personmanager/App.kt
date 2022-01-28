package com.hfad.pppk_delivery_7_personmanager

import android.app.Application
import com.hfad.pppk_delivery_7_personmanager.dao.PeopleDatabase
import com.hfad.pppk_delivery_7_personmanager.dao.PersonDao

class App : Application() {
    private lateinit var personDao: PersonDao

    override fun onCreate() {
        super.onCreate()
        var db = PeopleDatabase.getInstance(this)
        personDao = db.personDao()
    }

    fun getPersonDao() = personDao
}