# Week5

## Notes (2023-10-20)

1. Even though OASIS requires the class
   names to be Week4 and Week4Test, the
   assignment appeared on OASIS in the
   Week5's section.

2. `Week4Test` must be placed inside the
   subfolder `test`, since in `pom.xml`
   we have:

      ```
      <dependencies>
         <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>             <!-- Line (*) -->
        </dependency>
      </dependencies>
      ```

   and `Line (*)` above causes us to
   place test classes, in this case
   `Week4Test`, in subfolder `test`
   instead of `main` as in the case
   of `Week4` class.

   Hint: <https://stackoverflow.com/a/12403544/13680015>.
