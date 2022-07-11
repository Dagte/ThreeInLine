package com.threeinline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DefaultArgumentParser implements ArgumentParser {
    private Map<String, Shape> validArguments = Map.ofEntries(
            Map.entry("s", Shape.SCISSORS),
            Map.entry("scissors", Shape.SCISSORS),
            Map.entry("p", Shape.PAPER),
            Map.entry("paper", Shape.PAPER),
            Map.entry("r", Shape.ROCK),
            Map.entry("rock", Shape.ROCK)
    );

    @Override
    public List<Shape> parse(String[] args) {
        var shapes = new ArrayList<Shape>();
        if (args == null) {
            throw new RuntimeException("There should be some args");
        }
        if (args.length > 6) {
            throw new RuntimeException("Player should only make one move at the time");
        }
        for (String arg : args) {
            var argument = arg.toLowerCase();
            if (!validArguments.containsKey(argument)) {
                throw new RuntimeException("Player should make a valid move");
            }
            shapes.add(validArguments.get(argument));
        }
        return shapes;
    }
}
