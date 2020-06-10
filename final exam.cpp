/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

// arrays as parameters
#include <iostream>
using namespace std;

void printarray (int arg[], int length) {
  for (int n=0; n<length; ++n)
    cout << arg[n] << ' ';
  cout << '\n';
}

int main(){
    int n, num,number;

cout <<"Please give an number";
cin >> num;
for (n=0; n <= num; n++){
    //number=printarray(num);
    cout << number << "\t";
        }
 return 0;
}