package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> alreadyFinishedContent = new LinkedHashSet<>();

    public void subscribeToBootcamp(Bootcamp bootcamp) {
        this.subscribedContent.addAll(bootcamp.getAvailableContent());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void updateProgress(){
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if(content.isPresent()){
            this.alreadyFinishedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        }else {
            System.out.println("No content available");
        }
    }

    public double calculateTotalXp(){
        return this.alreadyFinishedContent
                        .stream()
                        .mapToDouble(Content::calculateXp)
                        .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getAlreadyFinishedContent() {
        return alreadyFinishedContent;
    }

    public void setAlreadyFinishedContent(Set<Content> alreadyFinishedContent) {
        this.alreadyFinishedContent = alreadyFinishedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(alreadyFinishedContent, dev.alreadyFinishedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, alreadyFinishedContent);
    }
}
