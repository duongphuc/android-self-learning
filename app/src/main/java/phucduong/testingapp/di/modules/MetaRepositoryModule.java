package phucduong.testingapp.di.modules;

import android.app.Application;
import android.arch.persistence.room.Room;

import java.util.concurrent.Executors;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import phucduong.testingapp.data.MetaData;
import phucduong.testingapp.data.source.Local;
import phucduong.testingapp.data.source.MetaDataSource;
import phucduong.testingapp.data.source.Remote;
import phucduong.testingapp.data.source.local.AppDatabase;
import phucduong.testingapp.data.source.local.MetaDataDao;
import phucduong.testingapp.data.source.local.MetaLocalDataSource;
import phucduong.testingapp.data.source.remote.MetaRemoteDataSource;

@Module
public abstract class MetaRepositoryModule {
    private static final int THREAD_COUNT = 3;

    @Singleton
    @Binds
    @Local
    abstract MetaDataSource provideTasksLocalDataSource(MetaLocalDataSource dataSource);

    @Singleton
    @Binds
    @Remote
    abstract MetaDataSource provideTasksRemoteDataSource(MetaRemoteDataSource dataSource);

    @Singleton
    @Provides
    static AppDatabase provideDb(Application context) {
        return Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "App.db")
                .build();
    }

    @Singleton
    @Provides
    static MetaDataDao provideTasksDao(AppDatabase db) {
        return db.metaDataDao();
    }
}
