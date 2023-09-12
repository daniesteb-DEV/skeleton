/*
   Copyright 2009-2022 PrimeTek.

   Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.daniestebdev.skeleton.domain;

import java.io.Serializable;
import java.time.LocalDate;

public class Customer implements Serializable {

    private int id;
    private String name;
    private com.daniestebdev.skeleton.domain.Country country;
    private LocalDate date;
    private com.daniestebdev.skeleton.domain.CustomerStatus status;
    private int activity;
    private com.daniestebdev.skeleton.domain.Representative representative;

    public Customer() {}

    public Customer(int id, String name, com.daniestebdev.skeleton.domain.Country country, LocalDate date, com.daniestebdev.skeleton.domain.CustomerStatus status, int activity, com.daniestebdev.skeleton.domain.Representative representative) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.date = date;
        this.status = status;
        this.activity = activity;
        this.representative = representative;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.daniestebdev.skeleton.domain.Country getCountry() {
        return country;
    }

    public void setCountry(com.daniestebdev.skeleton.domain.Country country) {
        this.country = country;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public com.daniestebdev.skeleton.domain.CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(com.daniestebdev.skeleton.domain.CustomerStatus status) {
        this.status = status;
    }

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public com.daniestebdev.skeleton.domain.Representative getRepresentative() {
        return representative;
    }

    public void setRepresentative(com.daniestebdev.skeleton.domain.Representative representative) {
        this.representative = representative;
    }
}
