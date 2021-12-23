public class WeatherResponse {

    private List<Weather> weather;

    public WeatherResponse() {}

    public WeatherResponse(String main, String description) {
        this.weather = Collections.singletonList(new Weather(main, description));
    }

    public String getSummary() {
        return weather.stream()
                .map(w -> w.main + ": " + w.description)
                .collect(Collectors.joining("\n"));
    }

    public List<Weather> getWeather() {
        return weather;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherResponse that = (WeatherResponse) o;
        return Objects.equals(weather, that.weather);
    }


    public int hashCode() {
        return Objects.hash(weather);
    }


    public String toString() {
        return "WeatherResponse{" +
                "weather=" + weather +
                '}';
    }

    public static class Weather {
        private String main;
        private String description;

        public Weather() {}

        public Weather(String main, String description) {
            this.main = main;
            this.description = description;
        }

        public String getMain() {
            return main;
        }

        public String getDescription() {
            return description;
        }


        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Weather weather = (Weather) o;
            return Objects.equals(main, weather.main) &&
                    Objects.equals(description, weather.description);
        }


        public int hashCode() {
            return Objects.hash(main, description);
        }


        public String toString() {
            return "Weather{" +
                    "main='" + main + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }
}
