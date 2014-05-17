package com.example.boilerplate.app

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.content.Context

/**
 * Created by derui on 2014/04/14.
 */
class MainActivity() : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super<Activity>.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val itemId = item!!.getItemId()
        if (itemId == R.id.action_settings) {
            return true
        }
        return super<Activity>.onOptionsItemSelected(item)
    }
}