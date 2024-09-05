package coding.practice.hackerrank;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class InterviewSolutions {

	// 1. Find the nth largest element in an unsorted array
	public static int findNthLargest(int[] arr, int n) {
		if (arr == null || n > arr.length) {
			throw new IllegalArgumentException("Invalid input");
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int num : arr) {
			pq.offer(num);
			if (pq.size() > n) {
				pq.poll();
			}
		}
		return pq.peek();
	}

	// 2. Check if a given date falls on a weekend
	public static boolean isWeekend(LocalDate date) {
		DayOfWeek day = date.getDayOfWeek();
		return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
	}

	// 3. Find the first non-repeated character in a string
	public static char firstNonRepeatedChar(String str) {
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return '\0';
	}

	// 4. Reverse words in a sentence
	public static String reverseWords(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder reversed = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);
			if (i > 0) {
				reversed.append(" ");
			}
		}
		return reversed.toString();
	}

	// 5. Custom exception: WeekendWorkException
	static class WeekendWorkException extends Exception {
		public WeekendWorkException(String message) {
			super(message);
		}
	}

	// 6. Count working days between two dates
	public static int countWorkingDays(LocalDate start, LocalDate end, List<LocalDate> holidays) {
		int workingDays = 0;
		LocalDate current = start;
		while (!current.isAfter(end)) {
			if (!isWeekend(current) && !holidays.contains(current)) {
				workingDays++;
			}
			current = current.plusDays(1);
		}
		return workingDays;
	}

	// 7. Remove duplicates from an unsorted linked list
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode removeDuplicates(ListNode head) {
		if (head == null)
			return null;
		Set<Integer> seen = new HashSet<>();
		ListNode current = head;
		ListNode prev = null;
		while (current != null) {
			if (seen.contains(current.val)) {
				prev.next = current.next;
			} else {
				seen.add(current.val);
				prev = current;
			}
			current = current.next;
		}
		return head;
	}

	// 8. Implement a basic stack
	static class Stack {
		private int[] array;
		private int top;
		private int capacity;

		Stack(int size) {
			array = new int[size];
			capacity = size;
			top = -1;
		}

		public void push(int x) {
			if (isFull()) {
				throw new RuntimeException("Stack is full");
			}
			array[++top] = x;
		}

		public int pop() {
			if (isEmpty()) {
				throw new RuntimeException("Stack is empty");
			}
			return array[top--];
		}

		public int peek() {
			if (isEmpty()) {
				throw new RuntimeException("Stack is empty");
			}
			return array[top];
		}

		public boolean isEmpty() {
			return top == -1;
		}

		public boolean isFull() {
			return top == capacity - 1;
		}
	}

	// 9. Convert string to title case
	public static String toTitleCase(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		StringBuilder titleCase = new StringBuilder();
		boolean nextTitleCase = true;

		for (char c : input.toCharArray()) {
			if (Character.isSpaceChar(c)) {
				nextTitleCase = true;
			} else if (nextTitleCase) {
				c = Character.toTitleCase(c);
				nextTitleCase = false;
			}
			titleCase.append(c);
		}
		return titleCase.toString();
	}

	// 10. Find the longest palindromic substring
	public static String longestPalindromicSubstring(String s) {
		if (s == null || s.length() < 2) {
			return s;
		}
		int start = 0, maxLength = 1;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > maxLength) {
				start = i - (len - 1) / 2;
				maxLength = len;
			}
		}
		return s.substring(start, start + maxLength);
	}

	private static int expandAroundCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}

	// 11. Thread-safe singleton
	public static class Singleton {
		private static volatile Singleton instance;

		private Singleton() {
		}

		public static Singleton getInstance() {
			if (instance == null) {
				synchronized (Singleton.class) {
					if (instance == null) {
						instance = new Singleton();
					}
				}
			}
			return instance;
		}
	}

	// 12. Filter prime numbers
	public static List<Integer> filterPrimes(List<Integer> numbers) {
		return numbers.stream().filter(InterviewSolutions::isPrime).collect(Collectors.toList());
	}

	private static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// 13. Find the second largest element in an array
	public static int findSecondLargest(int[] arr) {
		if (arr == null || arr.length < 2) {
			throw new IllegalArgumentException("Array should have at least two elements");
		}
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;
			}
		}
		if (second == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("There is no second largest element");
		}
		return second;
	}

	// 14. Count repeated alphabets
	public static int countRepeatedAlphabets(String str) {
		Map<Character, Integer> charCount = new HashMap<>();
		for (char c : str.toLowerCase().toCharArray()) {
			if (Character.isLetter(c)) {
				charCount.put(c, charCount.getOrDefault(c, 0) + 1);
			}
		}
		return (int) charCount.values().stream().filter(count -> count > 1).count();
	}

	// 15. Find Labor Day for a given year
	public static LocalDate findLaborDay(int year) {
		LocalDate september1 = LocalDate.of(year, Month.SEPTEMBER, 1);
		return september1.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
	}

	// 16. Get date 3 days prior to today
	public static LocalDate getThreeDaysPrior() {
		return LocalDate.now().minusDays(3);
	}

	// 17. Count occurrences of a specific letter
	public static int countLetterOccurrences(String str, char letter) {
		return (int) str.chars().filter(ch -> ch == Character.toLowerCase(letter)).count();
	}

	// 18. Initialize and print integer array
	public static void initializeAndPrintArray() {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
	}

	// 19. Find the third largest element
	public static int findThirdLargest(int[] arr) {
		if (arr == null || arr.length < 3) {
			throw new IllegalArgumentException("Array should have at least three elements");
		}
		TreeSet<Integer> top3 = new TreeSet<>();
		for (int num : arr) {
			top3.add(num);
			if (top3.size() > 3) {
				top3.pollFirst();
			}
		}
		return top3.size() == 3 ? top3.first() : top3.last();
	}

	// 20. Character frequency map
	public static Map<Character, Integer> getCharFrequency(String str) {
		Map<Character, Integer> freqMap = new HashMap<>();
		for (char c : str.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}
		return freqMap;
	}
}