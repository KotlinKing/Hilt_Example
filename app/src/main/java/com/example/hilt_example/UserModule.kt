package com.example.hilt_example

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    @Provides
    @Named("sql")
    fun providesSQLRepository(sqlRepository: SQLRepository) : UserRepository {
        return sqlRepository
    }

    @Provides
    @FirebaseQualifier
    fun provideFirebaseRepository() : UserRepository {
        return FirebaseRepository()
    }
}