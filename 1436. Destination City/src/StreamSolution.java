import java.util.List;

class StreamSolution {
    public String destCity(List<List<String>> paths) {
        return paths.stream()
                .filter(path -> !paths.stream().anyMatch(secondPath -> path.get(1).equals(secondPath.get(0))))
                .map(path -> path.get(1))
                .findFirst()
                .orElse("");
    }
}