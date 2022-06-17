package po.revature;

public class MedianTwoSortedArray {
	
	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		System.out.println(getMedian(nums1, nums2));
		int[] nums3 = {1,3};
		int[] nums4 = {2};
		System.out.println(getMedian(nums3, nums4));
		int[] nums5 = {1,4,7};
		int[] nums6 = {3,4,5,6};
		System.out.println(getMedian(nums5, nums6));

	}

	static double getMedian(int[] intArray1, int[] intArray2) {
		int totalLength = intArray1.length + intArray2.length;
		int i0 = 0;
		int i1 = 0;
		int i2 = 0;
		int[] newArray = new int[totalLength];
		while((i1 < intArray1.length | i2 < intArray2.length) & i0 < totalLength) {
			if(i1 < intArray1.length & i2 < intArray2.length) {
				if(intArray1[i1] < intArray2[i2]) {
					newArray[i0++] = intArray1[i1++];
				}
				else {
					newArray[i0++] = intArray2[i2++];
				}
			}
			else if(i1 < intArray1.length & i2 >= intArray2.length) {
				newArray[i0++] = intArray1[i1++];
			}
			else {
				newArray[i0++] = intArray2[i2++];
			}
		}
		if(newArray.length%2 == 0) {
			return (newArray[(newArray.length/2)-1]+newArray[newArray.length/2])/2.0;
		}
		else {
			return newArray[newArray.length/2];
		}
	}

}
