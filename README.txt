This is an open source mod that I am working on. 

Finished task:
1.) Creating food 
2.) Creating boxes/loot_boxes
3.) Creating items


Current task: 
1.) Making this mod pokemon themed
2.) Adding more biomes
3.) Adding more armour

________________________________________
Installation and Running the mod
________________________________________
1.) Download and install Java 8's current JDK and JRE make sure you have Gradle 4.9!
2.) First make sure you have Minecraft Java version installed on your PC/MAC
3.) Download and install Forge 1.15.2 this is the current version for the mod I am working with
4.) Download this code to your desktop
5.) In Intellij click on OPEN OR IMPORT and click on the gradle.build of this folder and open it as a project
	This step make take a few minutes while it downloads all the dependencies
6.) Then on Mac run ./gradlew genIntellijruns 
7.) Then click on add configurations, click on +, then click on Applications and under it, RunClient should be available 
8.) Run the RunClient option and Minecraft should launch up
9.) Click on Pokemon mods (this is the title of my mods currently)
10.) Have fun!


________________________________________
The Jar(mod file)
________________________________________
1.) Navigate to the build folder
2.) Navigate to the libs folder
3.) modid_1.0.jar is the mod file, just import into your Minecraft forge
4.) If you would like to add onto this file just do steps 1-10
then run ./gradlew build to build your mod

If you do add onto this mod please send me an email and show me the 
nice mods you have made! I always like to share ideas :)


These are the installation instructions when you first download the forge folder
please refer to these instructions below if you get stuck. These are the original instructions
for when you first build your mods. 

________________ I don't own anything below this line_________




-------------------------------------------
Source installation information for modders
-------------------------------------------
This code follows the Minecraft Forge installation methodology. It will apply
some small patches to the vanilla MCP source code, giving you and it access 
to some of the data and functions you need to build a successful mod.

Note also that the patches are built against "unrenamed" MCP source code (aka
srgnames) - this means that you will not be able to read them directly against
normal code.

Source pack installation information:

Standalone source installation
==============================

See the Forge Documentation online for more detailed instructions:
http://mcforge.readthedocs.io/en/latest/gettingstarted/

Step 1: Open your command-line and browse to the folder where you extracted the zip file.

Step 2: You're left with a choice.
If you prefer to use Eclipse:
1. Run the following command: "gradlew genEclipseRuns" (./gradlew genEclipseRuns if you are on Mac/Linux)
2. Open Eclipse, Import > Existing Gradle Project > Select Folder 
   or run "gradlew eclipse" to generate the project.
(Current Issue)
4. Open Project > Run/Debug Settings > Edit runClient and runServer > Environment
5. Edit MOD_CLASSES to show [modid]%%[Path]; 2 times rather then the generated 4.

If you prefer to use IntelliJ:
1. Open IDEA, and import project.
2. Select your build.gradle file and have it import.
3. Run the following command: "gradlew genIntellijRuns" (./gradlew genIntellijRuns if you are on Mac/Linux)
4. Refresh the Gradle Project in IDEA if required.

If at any point you are missing libraries in your IDE, or you've run into problems you can run "gradlew --refresh-dependencies" to refresh the local cache. "gradlew clean" to reset everything {this does not affect your code} and then start the processs again.

Should it still not work, 
Refer to #ForgeGradle on EsperNet for more information about the gradle environment.
or the Forge Project Discord discord.gg/UvedJ9m

Forge source installation
=========================
MinecraftForge ships with this code and installs it as part of the forge
installation process, no further action is required on your part.

LexManos' Install Video
=======================
https://www.youtube.com/watch?v=8VEdtQLuLO0&feature=youtu.be

For more details update more often refer to the Forge Forums:
http://www.minecraftforge.net/forum/index.php/topic,14048.0.html
