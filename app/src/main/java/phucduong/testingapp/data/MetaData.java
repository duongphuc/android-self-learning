package phucduong.testingapp.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "Meta")
public class MetaData {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    @Expose
    @SerializedName("id")
    private int id;

    @Nullable
    @ColumnInfo(name = "name")
    @Expose
    @SerializedName("name")
    private String name;

    public MetaData(@NonNull int id, @Nullable String name) {
        this.id = id;
        this.name = name;
    }

    @NonNull
    public int getId() {
        return id;
    }

    @Nullable
    public String getName() {
        return name;
    }
}
