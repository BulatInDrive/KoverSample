## Preconditions
1. We have the `app` module that we don't want to check for coverage and a `feature` module that needs to be measured.
2. To do this, we only include the `feature` module in `kover.gradle`.
3. Running `koverXmlReport/koverHtmlReport` produces a valid report <img width="1278" alt="image" src="https://github.com/BulatInDrive/KoverSample/assets/127848635/096c0b9c-1643-4588-9daa-307a4c6268f4">
4. We also want to verify the coverage, but only for the modified classes. Let's assume that the modified classes include classes from both the `app` module and the `feature` module. So we run `./gradlew koverVerify -PchangedFiles=tat.mukhutdinov.koversample.feature.two.FeatureClassTwo,tat.mukhutdinov.koversample.one.AppClassOne`
5. This will cause our build to fail because `AppClassOne` has no tests

##  Question
Can we use the report from step #3 to use it in step verify?
We can't just exclude `"tat.mukhutdinov.koversample.*"` from koverVerify, as this path is contained in every other feature module.
