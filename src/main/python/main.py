import os  # Unused import violation


def main():
    # Unused variable violations
    unused_var = 42
    another_unused = "test"

    # Potential AttributeError - accessing attribute on None
    none_obj = None
    length = none_obj.length  # This will raise AttributeError

    # Bare except clause violation
    try:
        x = 10 / 0
    except:  # Too broad exception handling
        pass  # Empty except block

    print("Hello, World!")

    # Unreachable code
    return
    print("This will never execute")


# Unused function violation
def unused_function():
    print("This function is never called")


# Function with poor practices
def bad_practices():
    # Using global without declaring it
    global_var = "bad practice"

    # Mutable default argument
    def func_with_mutable_default(lst=[]):
        lst.append(1)
        return lst

    # Comparing with None using ==
    if global_var == None:  # Should use 'is None'
        pass


# Call main to make it executable
if __name__ == "__main__":
    main()
