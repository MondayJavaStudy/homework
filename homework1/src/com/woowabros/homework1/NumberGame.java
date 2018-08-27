package com.woowabros.homework1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberGame {

    private final static int MIN = 0;
    private final static int MAX = 20;
    private final static String NUMBERS_DEPLIMITER = " ";

    private List<Integer> numbers;
    private Integer one;

    public void start() {
        inputNumbers();
        inputOne();
        printAnswer();
    }

    public void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        String inputs = scanner.nextLine();
        numbers = Stream.of(inputs.split(NUMBERS_DEPLIMITER))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        if (numbers.stream().anyMatch(i -> i < MIN || i > MAX)) {
            throw new IllegalArgumentException("bad numbers");
        }
    }

    public void inputOne() {
        Scanner scanner = new Scanner(System.in);
        one = Integer.parseInt(scanner.nextLine());
    }

    public void printAnswer() {
        List<AnswerValue> answers = new ArrayList<>();

        for (int i = 0; i < numbers.size() - 1; i++) {

            for (int j = i + 1; j < numbers.size() - 1; j++) {

                for (int k = j + 1; k < numbers.size() - 1; k++) {
                    if (i + j + k == one) {
                        List<Integer> as = Arrays.asList(i, j, k);
                        List<Integer> sorted = as.stream()
                                .sorted()
                                .collect(Collectors.toList());
                        answers.add(new AnswerValue(sorted.get(0), sorted.get(1), sorted.get(2)));
                    }
                }
            }
        }

        answers.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList())
                .forEach(answer -> System.out.println(answer.a + " " + answer.b + " " + answer.c));
    }

    public static class AnswerValue implements Comparable<AnswerValue> {
        private int a;
        private int b;
        private int c;

        public AnswerValue(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public int compareTo(AnswerValue o) {
            if (a != o.a)
                return a - o.a;
            if (b != o.b)
                return b - o.b;
            return c - o.c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            AnswerValue that = (AnswerValue) o;
            return a == that.a &&
                    b == that.b &&
                    c == that.c;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b, c);
        }
    }
}
