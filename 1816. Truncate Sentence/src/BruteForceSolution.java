class BruteForceSolution {
    public String truncateSentence(String s, int k) {
        return Arrays.stream(s.split(" "))
                .map(item -> item.trim())
                .limit(k)
                .collect(Collectors.joining(" "));
    }
}