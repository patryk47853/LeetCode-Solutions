class SecondSolution {
    public String reorganizeString(String s) {
        // Step 1: Create a frequency map to count occurrences of each character
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create a max-heap (priority queue) using a custom comparator
        PriorityQueue<Character> maxheap = new PriorityQueue<>(
                (a, b) -> map.get(b) - map.get(a)
        );

        // Step 3: Add unique characters to the max-heap
        maxheap.addAll(map.keySet());

        // This StringBuilder will store the reorganized string
        StringBuilder sb = new StringBuilder();

        // Step 4: Reorganize the string while maintaining frequency constraints
        while (maxheap.size() > 1) {
            // Poll the two characters with highest frequencies
            char first = maxheap.poll();
            char second = maxheap.poll();

            // Append these characters to the reorganized string
            sb.append(first);
            sb.append(second);

            // Decrement the frequencies of these characters
            map.put(first, map.get(first) - 1);
            map.put(second, map.get(second) - 1);

            // Re-add characters to the max-heap if their frequency is still positive
            if (map.get(first) > 0) {
                maxheap.offer(first);
            }

            if (map.get(second) > 0) {
                maxheap.offer(second);
            }
        }

        // Handle the case of a single character left in the max-heap
        if (!maxheap.isEmpty()) {
            // If its frequency is greater than 1, reorganization is not possible
            if (map.get(maxheap.peek()) > 1) {
                return "";
            }
            // Append the last character to the reorganized string
            else {
                sb.append(maxheap.poll());
            }
        }

        // Step 5: Return the reorganized string
        return sb.toString();
    }
}
