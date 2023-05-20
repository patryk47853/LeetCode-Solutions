class StockSpanner {
    List<Integer> list;

    public StockSpanner() {
        this.list = new ArrayList<>();
    }

    public int next(int price) {
        int maxIndex = list.size() - 1;
        list.add(price);
        int count = 0;
        for (int i = maxIndex; i >= 0; i--) {
            if (list.get(i) > price)
                break;
            count++;
        }

        return count + 1;
    }

    public int[] calculateSpans(int[] prices) {
        int size = prices.length;

        int[] spans = new int[size];
        spans[0] = 1;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < size; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i])
                stack.pop();

            if (stack.isEmpty())
                spans[i] = i + 1;
            else
                spans[i] = i - stack.peek();


            stack.push(i);
        }

        return spans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */