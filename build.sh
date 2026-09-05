#!/bin/bash

# Build script for Terraria Inspired Mod

echo "Building Terraria Inspired Mod for Fabric 1.20.1..."

# Clean previous builds
./gradlew clean

# Build the mod
./gradlew build

# Check if build was successful
if [ $? -eq 0 ]; then
    echo "Build completed successfully!"
    echo "JAR file location: build/libs/"
else
    echo "Build failed!"
    exit 1
fi