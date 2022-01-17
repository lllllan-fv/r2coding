# 二分



## 1-[704. 二分查找 - 力扣（LeetCode） (leetcode-cn.com)](https://leetcode-cn.com/problems/binary-search/)

```java
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        int mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (l >= nums.length || nums[l] != target) l = -1;

        return l;
    }
}
```



## 2-[35. 搜索插入位置 - 力扣（LeetCode） (leetcode-cn.com)](https://leetcode-cn.com/problems/search-insert-position/)

给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

请必须使用时间复杂度为 O(log n) 的算法。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/search-insert-position
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        } 

        return l;
    }
}
```



## 3-[34. 在排序数组中查找元素的第一个和最后一个位置 - 力扣（LeetCode） (leetcode-cn.com)](https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

如果数组中不存在目标值 target，返回 [-1, -1]。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

```java
class Solution {
    public int bs(int[] nums, int val, int tmp) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < val) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        l -= tmp;
        if (l >= 0 && l < nums.length && nums[l] == val - tmp) return l;
        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{bs(nums, target, 0), bs(nums, target + 1, 1)};
    }
}
```



## 4-[69. Sqrt(x) - 力扣（LeetCode） (leetcode-cn.com)](https://leetcode-cn.com/problems/sqrtx/submissions/)

给你一个非负整数 x ，计算并返回 x 的 算术平方根 。

由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。

注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/sqrtx
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

```java
class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long tmp = 1l * mid * mid;
            if (tmp < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        long tmp = 1l * l * l;
        if (tmp > x) l--;
        return l;
    }
}
```



## 5-[367. 有效的完全平方数 - 力扣（LeetCode） (leetcode-cn.com)](https://leetcode-cn.com/problems/valid-perfect-square/submissions/)

给定一个 **正整数** `num` ，编写一个函数，如果 `num` 是一个完全平方数，则返回 `true` ，否则返回 `false` 。

```java
class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 0, r = num;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long tmp = 1l * mid * mid;
            if (tmp < num) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        long tmp = 1l * l * l;
        return tmp == num;
    }
}
```



# 移除元素



## 1-[27. 移除元素 - 力扣（LeetCode） (leetcode-cn.com)](https://leetcode-cn.com/problems/remove-element/submissions/)

给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-element
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;

        for (int num : nums) {
            if (num != val) nums[l++] = num;
        }

        return l;
    }
}
```



## 2-[26. 删除有序数组中的重复项 - 力扣（LeetCode） (leetcode-cn.com)](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/)

给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。

不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int ans = 0;

        for (int i = 1, len = nums.length; i < len; ++i) {
            if (nums[i] != nums[ans]) {
                nums[++ans] = nums[i];
            }
        }

        return ans + 1;
    }
}
```



## 3-[283. 移动零 - 力扣（LeetCode） (leetcode-cn.com)](https://leetcode-cn.com/problems/move-zeroes/submissions/)

给定一个数组 `nums`，编写一个函数将所有 `0` 移动到数组的末尾，同时保持非零元素的相对顺序。

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        for (int i = 0, len = nums.length; i < len; ++i) {
            if (nums[i] != 0) {
                nums[l++] = nums[i];
            }
        }

        for (int i = l, len = nums.length; i < len; ++i) {
            nums[i] = 0;
        }
    }
}
```

