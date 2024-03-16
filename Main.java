import assets.ApplePie.*;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplePieRecipe recipe = new ApplePieRecipe();

        printIngredients(recipe);
        printSteps(recipe);
    }

    private static void printIngredients(ApplePieRecipe recipe)
    {
        System.out.println("Ingredienten:");

        for (Ingredient ingredient : recipe.recipe) {
            DecimalFormat df = new DecimalFormat("###");
            String reformattedAmount = (df.format(ingredient.getAmount()));
            System.out.println(reformattedAmount + " " + ingredient.getUnit() + " " + ingredient.getItem());
        }
    }

    private static void printSteps(ApplePieRecipe recipe)
    {
        System.out.println("Stappen:");
        int i = 0;
        for (String step : recipe.Steps)
        {
            System.out.println(i+1 + ". " + recipe.Steps[i]);
            i++;
        }
    }
}
