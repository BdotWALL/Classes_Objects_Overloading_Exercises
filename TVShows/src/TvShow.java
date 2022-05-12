public class TvShow {
    String showName;
    int episodes;
    String genre;

        public TvShow (String name, int numOfEps, String showType) {
            this.showName = name;
            this. episodes = numOfEps;
            this.genre = showType;
        }

        public TvShow (String name, int numOfEps){
            this(name, numOfEps, "Unknown");
        }


        public String getName() {
            return this.showName;
        }

        public int getEpisodes() {
            return this.episodes;
        }

        public String getGenre() {
            return this.genre;
        }

        public String toString() {
            return "The name of the show is " + getName() + " with " + getEpisodes() + " number of episodes." +
            " The genre is " + getGenre();
        }
}
