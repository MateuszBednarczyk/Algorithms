package binary

import "fmt"

var guess int
var item int

func BinarySearch() {
	fmt.Println("Pass item u re looking for")
	fmt.Scan(&item)

	array := setupArray()
	low := 0
	high := len(array) - 1

	for low <= high {
		mid := low + high
		guess = array[mid]
		if guess < item {
			low = mid + 1
		} else if guess > item {
			high = mid - 1
		} else {
			fmt.Println("Item found at:", mid+1, "place in array")
			break
		}
	}
}

func setupArray() []int {
	return []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
}
