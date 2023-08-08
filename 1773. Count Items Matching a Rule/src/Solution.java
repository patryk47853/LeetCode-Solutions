import java.util.List;
import java.util.Objects;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;

        for (int i = 0; i < items.size(); i++) {
            List<String> currentList = items.get(i);

            if (Objects.equals(ruleKey, "type") && ruleValue.equals(currentList.get(0))) {
                ans++;
            } else if (Objects.equals(ruleKey, "color") && ruleValue.equals(currentList.get(1))) {
                ans++;
            } else if (Objects.equals(ruleKey, "name") && ruleValue.equals(currentList.get(2))) {
                ans++;
            }
        }

        return ans;
    }
}