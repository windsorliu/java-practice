## 題目
使用者可輸入任意個數且可重複之數字<br>
去除重複數字後，將數字從小到大排序<br>

ex:<br>
給定一個數列 
> [ 1, 2, 3, 3, 2, 1, 9, 9, 8, 7 ]

經過轉換後得到
> [ 1, 2, 3, 7, 8, 9 ]      

## 思路
我使用了兩種解法，一個是使用TreeSet，一個不借助Java Collections，單純使用array刻出來

### Main function
使用者可以輸入一個字串(Scanner接收)，並且用String.split(regex)拆分成String array<br>
註：我沒有處理使用者輸入非數字的情況

### useSet
沒有什麼特別的，就是使用TreeSet不重複元素且自動排序的功能達成題目要求

### notUseSet
1. 先將得到的String array一個一個檢查是否有元素重複，若 i 和 i+1 重複，則將 i+1 設為""
2. 計算String array排除掉值為""的數值共有幾個，並且以此數量建立int array
3. 使用foreach將String array轉換成int array，需要排除掉String值為""的情況(因為無法轉換成int)
4. 使用Bubble Sort將int array做排序
5. 印出int array