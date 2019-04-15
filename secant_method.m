function [solution,no_iterations] = secant_method(f, x0, x1, e)
%Compute a root of the equation f(x)=0 in [x0, x1] to accuracy e using the 
%secant method.

    %subsitute in the equation f(x) for values at x_0 and x_1
    f_x0 = f(x0);
    f_x1 = f(x1);
    counter = 0;
    %while the absoulte value of f_x1 is GREATER than the accuracy e keep
    %comuting unless you find f_x1 such that < accuracy e then exist the
    %while loop
    while abs(f_x1) > e 
        try
            %the formula of the secant method
            denominator = (f_x1 - f_x0);
            nominator = (x1-x0)* f_x1 ;
            x = x1 - nominator/denominator;
        catch
            %if the denominator is zero then break the while loop
            fprintf('Error! - denominator zero for x = \n', x1)
            break
        end
        %Display x0,f_x0,x1,f_x1, x , f(x)
        [x0,f_x0,x1,f_x1, x , f(x)]
        %update the variables
        x0 = x1;
        x1 = x;
        f_x0 = f_x1;
        f_x1 = f(x1);
        %counter will be incremented by 1 every time I enter the loop
       counter = counter + 1;
    end
    
    % Here, solution is found
    solution = x1;
    no_iterations = counter;
    fprintf('Number of function calls: %d\n', 2 + no_iterations);
    fprintf('The root is: %f\n', solution);
end
