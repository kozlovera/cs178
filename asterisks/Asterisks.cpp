#include <iostream>
using namespace std;

using std::endl;
using std::cout;

void PrintAstr ( int n ) {

int numberInput;
cin >> numberInput; 
 
  for (int i = 0; i<numberInput; i++ ) {
     cout << '*';
}
      cout << endl;
      
 
 }

int numberInput;
int main()
{
while (true) { 
cout << "Enter number of asterisks: " << endl ;
 PrintAstr( numberInput );
cout << "Do you want to start again? yes/no " << endl ;
string stringInput ;
cin >> stringInput;
if ( stringInput == "no" ) {
break ;
}
}
}
