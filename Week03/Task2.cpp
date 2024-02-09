#include <iostream>
#include <vector>
using namespace std;

vector<int> customMap(const vector<int> &vec, int (*func)(int))
{
    vector<int> result;
    result.reserve(vec.size());
    for (const int &element : vec)
    {
        result.push_back(func(element));
    }
    return result;
}

vector<int> customFilter(const vector<int> &vec, bool (*predicate)(int))
{
    vector<int> result;
    for (const int &element : vec)
    {
        if (predicate(element))
        {
            result.push_back(element);
        }
    }
    return result;
}

int main()
{
    vector<int> nums = {1, 2, 3, 4, 5};

    // Using lambda expressions for map and filter
    vector<int> squared = customMap(nums, [](int x)
                                    { return x * x; });
    vector<int> odds = customFilter(nums, [](int x)
                                    { return x % 2 != 0; });

    cout << "Squared Numbers: ";
    for (int num : squared)
    {
        cout << num << " ";
    }
    cout << endl;

    cout << "Odd Numbers: ";
    for (int num : odds)
    {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
