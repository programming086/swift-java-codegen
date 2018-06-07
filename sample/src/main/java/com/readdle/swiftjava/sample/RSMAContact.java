package com.readdle.swiftjava.sample;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.readdle.codegen.anotation.SwiftValue;

import java.io.Serializable;
import java.util.ArrayList;

@SwiftValue
public class RSMAContact implements Serializable {
    @NonNull
    public ArrayList<String> emails = new ArrayList<>();

    @NonNull
    public String id;

    @Nullable
    public String name = "noname"; //todo remove test

    public RSMAContact() {
    }

    public RSMAContact(@NonNull ArrayList<String> emails, @NonNull String id) {
        this.emails = emails;
        this.id = id;
    }
}