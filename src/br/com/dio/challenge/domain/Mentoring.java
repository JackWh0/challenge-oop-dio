package br.com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Content{
    private LocalDate date;

    @Override
    public double calculateXp() {
        return DEFAULT_XP + 10d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring: " +
                this.getTitle() + " | " +
                "date: " + date;
    }
}
