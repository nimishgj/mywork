#include <iostream>

using namespace std;

int main()
{
    char a[6];
    int i = 0;
    cout << "Enter a name:";
    for (int i = 0; i < 6; i++)
    {
        cin >> a[i];
    }
    for (int i = 0; i < 6; i++)
    {
        cout <<a[i];
    }
}