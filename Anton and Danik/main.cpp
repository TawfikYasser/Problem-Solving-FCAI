#include <iostream>
#include <string>
using namespace std;

int main()
{
    long n=0;
    string str;
    cin>>n>>str;
    int ca=0,cd=0;
    for(int i=0;i<str.length();i++)
    {
        if(str[i]=='A')
            ca++;
        else if(str[i]=='D')
            cd++;
    }
    if(ca>cd)
        cout<<"Anton";
    else if(cd>ca)
        cout<<"Danik";
    else
        cout<<"Friendship";
    return 0;
}
