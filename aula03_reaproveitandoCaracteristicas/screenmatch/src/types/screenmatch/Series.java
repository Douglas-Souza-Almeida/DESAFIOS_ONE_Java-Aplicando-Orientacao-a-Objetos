package types.screenmatch;

public class Series extends Title {
    //definindo atributos
    private int totalSeasons;
    private int episodesPerSeasons;
    private int episodeRuntime;

    //métodos getter
    public int getTotalSeasons() {
        return totalSeasons;
    }

    public int getEpisodesPerSeasons() {
        return episodesPerSeasons;
    }

    public int getEpisodeRuntime() {
        return episodeRuntime;
    }

    //métodos setter
    public void setTotalSeasons(int totalSeasons) {
        this.totalSeasons = totalSeasons;
    }

    public void setEpisodesPerSeasons(int episodesPerSeasons) {
        this.episodesPerSeasons = episodesPerSeasons;
    }

    public void setEpisodeRuntime(int episodeRuntime) {
        this.episodeRuntime = episodeRuntime;
    }

    //métodos da classe
    @Override
    public int getTimeInMinutes () {
        return totalSeasons * episodesPerSeasons *episodeRuntime;
    }
}
