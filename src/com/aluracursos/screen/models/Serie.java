package com.aluracursos.screen.models;

public class Serie extends Title {

    private int seasons;
    private int episodesPerSeasons;
    private int minutesPerSeasons;


    @Override
    public int getDurationInMinutes() {
        return seasons * episodesPerSeasons * minutesPerSeasons;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeasons() {
        return episodesPerSeasons;
    }

    public void setEpisodesPerSeasons(int episodesPerSeasons) {
        this.episodesPerSeasons = episodesPerSeasons;
    }

    public int getMinutesPerSeasons() {
        return minutesPerSeasons;
    }

    public void setMinutesPerSeasons(int minutesPerSeasons) {
        this.minutesPerSeasons = minutesPerSeasons;
    }
}
