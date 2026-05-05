package com.naveenapps.expensemanager.core.data.repository

import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.naveenapps.expensemanager.core.repository.FirebaseSettingsRepository

class FirebaseSettingsRepositoryImpl(
    private val firebaseRemoteConfig: FirebaseRemoteConfig
) : FirebaseSettingsRepository {

    override fun getPrivacyURL(): String {
        return firebaseRemoteConfig.getString("abbas_privacy_url").ifBlank {
            DEFAULT_PRIVACY_URL
        }
    }

    override fun getTermsURL(): String {
        return firebaseRemoteConfig.getString("abbas_terms_url").ifBlank {
            DEFAULT_TERMS_URL
        }
    }

    override fun getAboutUsURL(): String {
        return firebaseRemoteConfig.getString("abbas_about_us_url").ifBlank {
            DEFAULT_ABOUT_US_URL
        }
    }

    override fun getGithubURL(): String {
        return firebaseRemoteConfig.getString("abbas_github_url").ifBlank {
            DEFAULT_GITHUB_URL
        }
    }

    override fun getLinkedInURL(): String {
        return firebaseRemoteConfig.getString("abbas_linkedin_url").ifBlank {
            DEFAULT_LINKEDIN_URL
        }
    }

    override fun getFeedbackEmail(): String {
        return firebaseRemoteConfig.getString("abbas_feedback_email").ifBlank {
            DEFAULT_FEEDBACK_EMAIL
        }
    }

    companion object {
        private const val DEFAULT_GITHUB_URL: String = "https://github.com/meabbasmehdi"
        private const val DEFAULT_LINKEDIN_URL: String =
            "https://www.linkedin.com/in/meabbasmehdi/"
        private const val DEFAULT_PRIVACY_URL: String = DEFAULT_LINKEDIN_URL
        private const val DEFAULT_TERMS_URL: String = DEFAULT_LINKEDIN_URL
        private const val DEFAULT_ABOUT_US_URL: String = DEFAULT_LINKEDIN_URL
        private const val DEFAULT_FEEDBACK_EMAIL: String = "meabbasmehdi@gmail.com"
    }
}
