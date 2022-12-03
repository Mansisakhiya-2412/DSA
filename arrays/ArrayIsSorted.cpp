#include<bits/stdc++.h>
using namespace std;

bool IsArraySorted(int arr[],int n){

    for(int i = 1;i<n;i++){
        if(arr[i] < arr[i-1]){
            return false;
        }
    }
    return true;
}

int main(){

    int arr[] = {10,20,30,1} ;
    
    cout<<IsArraySorted(arr,4);

    return 0;
}