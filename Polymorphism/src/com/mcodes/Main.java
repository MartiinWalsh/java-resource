package com.mcodes;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot.";
    }

    public String getName() {
        return name;
    }
}

class Titanic extends Movie{
    public Titanic(){
        //Initialising name field from base class, Movie
        super("Titanic");
    }

    @Override
    public String plot(){
        return "British passenger liner that sank in the North Atlantic Ocean after striking an iceberg.";
    }
}

class IndependenceDay extends Movie{

    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attack Earth.";
    }
}

class Nightcrawler extends Movie{

    public Nightcrawler(){
        super("Nightcrawler");
    }

    @Override
    public String plot() {
        return "Lead realises that he can make money by capturing photographs of criminal activities.";
    }
}

class StarWars extends Movie{

    public StarWars(){
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Civil war taking place in a galaxy far far away.";
    }
}

class Unknown extends Movie{
    public Unknown(){
        super("Unknown.");
    }
}

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i< 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        //random number between 0 - 5
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number is " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Titanic();

            case 2:
                return new IndependenceDay();

            case 3:
                return new Nightcrawler();

            case 4:
                return new StarWars();

            case 5:
                return new Unknown();
        }

        return null;
    }
}
