#include<bits/stdc++.h>
using namespace std;


int getelement(int arr[],int n ){

	int res = 0;

	for(int i = 1 ; i<n ; i++){
		if (arr[i] > arr[res])
		{
			res = i;

			
		}
		
	}
	return res;

}
int main(){

	// int n ;  cin>>n;
	// int arr[n] ;

	// for (int i = 0; i < n; i++)
	// {
	// 	cin>>arr[i];
	// }

	int arr[] = {1,12,32,5,56};

	cout<<getelement(arr,5);
	

	return 0;
}