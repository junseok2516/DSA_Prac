import java.util.*;

public class TopKFrequentElements347 {
    /* can think counting them in each index but
    * failed to rank top k elements output */
//    public static int[] topKFrequent(int[] nums, int k) {
//        // each number in nums counting
//        Map<Integer, Integer> count = new HashMap<>();
//        for (int num : nums) {
//            count.put(num, count.getOrDefault(num, 0)+1);
//        }
//
//        // order freq
//        List<Integer>[] orderFreq = new List[nums.length+1]; // include 0 for adding 1
//        for (int key : count.keySet()) {
//            if (orderFreq[count.get(key)] == null) {
//                orderFreq[count.get(key)] = new ArrayList<>();
//            }
//            orderFreq[count.get(key)].add(key);
//        }
//
//        // k output
//        List<Integer> answer = new ArrayList<>();
//        for (int i = orderFreq.length-1; i >= 0 && answer.size() < k; i--) {
//            if (orderFreq[i] != null) {
//                answer.addAll(orderFreq[i]);
//            }
//        }
//        return answer.stream().mapToInt(i->i).toArray();
//    }

    /* easier to understand the last step regarding getting output
    * */
    public static int[] topKFrequent(int[] nums, int k) {
        // count the number of key as value
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // order values (index = rank, and values = key(s))
        List<Integer>[] orderFreq = new List[nums.length];
        for (int key : count.keySet()) {
            if (orderFreq[count.get(key)] == null) {
                orderFreq[count.get(key)] = new ArrayList<>();
            }
            orderFreq[count.get(key)].add(key);
        }

        int[] answers = new int[k];
        int cnt = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (orderFreq[i] != null) {
                for (int j : orderFreq[i]) {
                    answers[cnt] = j;
                    cnt++;
                    if (cnt == 2) {
                        return answers;
                    }
                }
            }
        }

        return answers;
    }


    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(nums, 2))); // {1,2}
    }
}



