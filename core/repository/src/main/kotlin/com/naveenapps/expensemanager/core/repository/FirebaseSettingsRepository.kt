package com.naveenapps.expensemanager.core.repository

interface FirebaseSettingsRepository {

    fun getPrivacyURL(): String

    fun getTermsURL(): String

    fun getAboutUsURL(): String

    fun getGithubURL(): String

    fun getLinkedInURL(): String

    fun getFeedbackEmail(): String
}
