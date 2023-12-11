package cn.bugstack.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源接口
 * 资源可以是文件、类路径或者网络等形式的数据，都需要通过 ResourceLoader 进行加载。
 */
public interface Resource {

    /**
     * 获取输入流
     * @return 输入流
     * @throws IOException 输入输出异常
     */
    InputStream getInputStream() throws IOException;

}
