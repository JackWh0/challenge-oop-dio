package br.com.dio.challenge.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String title;
    private String description;
    private Set<Dev> subscribedDevs = new HashSet<>();
    private Set<Content> availableContent = new LinkedHashSet<>();

    private final LocalDate START_DATE = LocalDate.now();
    private final LocalDate DUE_DATE = LocalDate.now().plusDays(45);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Dev> getSubscribedDevs() {
        return subscribedDevs;
    }

    public void setSubscribedDevs(Set<Dev> subscribedDevs) {
        this.subscribedDevs = subscribedDevs;
    }

    public Set<Content> getAvailableContent() {
        return availableContent;
    }

    public void setAvailableContent(Set<Content> availableContent) {
        this.availableContent = availableContent;
    }

    public LocalDate getSTART_DATE() {
        return START_DATE;
    }

    public LocalDate getDUE_DATE() {
        return DUE_DATE;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(title, bootcamp.title) && Objects.equals(description, bootcamp.description) && Objects.equals(subscribedDevs, bootcamp.subscribedDevs) && Objects.equals(availableContent, bootcamp.availableContent) && Objects.equals(START_DATE, bootcamp.START_DATE) && Objects.equals(DUE_DATE, bootcamp.DUE_DATE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, subscribedDevs, availableContent, START_DATE, DUE_DATE);
    }
}
