class TwoInOneSolution {
    public String toLowerCase(String s) {
        // First solution:

        // Create a StringBuilder to build the lowercase string
        StringBuilder sb = new StringBuilder();

        // Loop through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // Get the current character at index i
            char c = s.charAt(i);

            // Check if the character is an uppercase letter ('A' to 'Z')
            if (c >= 'A' && c <= 'Z') {
                // If it's uppercase, convert it to lowercase
                // by adding the ASCII difference between uppercase and lowercase letters (32)
                c = (char) (c + 32);
            }

            // Append the modified or unmodified character to the StringBuilder
            sb.append(c);
        }

        // Convert the StringBuilder to a string and return
        return sb.toString();


        // Second solution (very simple) --> return s.toLowerCase();
    }
}