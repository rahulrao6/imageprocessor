# Introduction
This README provides a technical outline of the Image Processing Application. The application is architected following a variant of the Model-View-Controller (MVC) pattern, with a significant focus on the model's handling of image data. It utilizes several algorithms for image manipulation, supporting a range of file formats.

Current Structure
The application is structured into the following main packages:

### Model (model package): Central to the application, the model handles data representation and manipulation. It includes:

ImageImpl class: Represents the image with pixel matrices and supports image transformation methods.
Pixel class: Encapsulates the color data of a single pixel and provides color manipulation methods.
ImageUtil class: Provides static methods for loading and saving images in various formats, as well as utilities for image cloning and conversion.
### View (view package): Contains classes for the user interface, such as GuiView, which extends JFrame to create a graphical user interface for the application.

### Controller (controller package): Contains classes that implement action listeners and other event-handling logic.

# Design Patterns and Principles
MVC Pattern: The application separates concerns into model, view, and controller components but could benefit from a more decoupled MVC implementation, where the model does not directly handle file operations.

Utility Pattern: The ImageUtil class is a utility class that abstracts file operations away from the model.

## Algorithms
Image Loading and Saving
The ImageUtil class contains the algorithms for loading and saving images:

Loading (PPM and Standard Formats): Determines the file type and processes the image data into a pixel matrix, which can be manipulated by the application.
Saving (PPM and Standard Formats): Translates the pixel matrix into the desired file format and writes it to disk.
Image Manipulation
The ImageImpl class provides algorithms for image manipulation:

Flip (Horizontal and Vertical): Reverses the order of pixels along the specified axis.
Brighten/Darken: Modifies the intensity of each pixel's color components.
Greyscale Conversion: Applies a transformation to the pixel's colors to convert the image into greyscale using different methods (luma, intensity, value).
Filter Application
Filters are applied using kernel matrices to transform the image:

Blur: Uses a kernel to average neighboring pixels, softening the image.
Sharpen: Enhances the contrast between neighboring pixels to make the image appear clearer.
Utility Methods
Histogram Creation: Generates a histogram of the color components' frequency in the image.
Data Structures
Pixel Matrix: A 2D array of Pixel objects representing the image.
Kernel Matrices: 2D arrays defining the weight of neighboring pixels for filter applications.

Future Improvements
Refactoring File Operations: Separating file operations from the model to adhere more strictly to the MVC pattern.
Command Pattern: Implementing the Command pattern for image operations to enhance extensibility and undo/redo capabilities.
Performance Optimization: Improving the efficiency of image processing algorithms, particularly for large images.
Conclusion
This application presents a foundational approach to image processing with a structured framework for manipulation and transformation of pixel data. It is designed for extensibility and could be further improved with design pattern refinements and performance optimization.