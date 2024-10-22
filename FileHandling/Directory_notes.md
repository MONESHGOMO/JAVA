| Feature                          | `mkdir()`                        | `mkdirs()`                                                 |
| -------------------------------- | ---------------------------------- | ------------------------------------------------------------ |
| **Creates**                | Only the specified directory       | The specified directory and all necessary parent directories |
| **Existing Directory**     | Returns `false` if it exists     | Returns `false` if it exists                               |
| **Parent Directory Check** | Does not create parent directories | Creates all missing parent directories                       |

### When to Use

- **Use `mkdir()`** when you are sure that the parent directories already exist, and you only need to create a single directory.
- **Use `mkdirs()`** when you want to ensure that the entire directory path is created, including any missing parent directories. This is particularly useful when creating nested directory structures.
