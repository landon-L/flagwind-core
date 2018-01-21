
package com.flagwind.application;

import com.flagwind.events.EventArgs;

/**
 * 应用程序事件参数类。
 * @class
 * @version 1.0.0
 */
public class ApplicationEventArgs extends EventArgs {
    /**
     * 获取应用程序上下文实例。
     * @member
     */
    private ApplicationContextBase context;

    /**
     * 初始化应用程序事件参数类的新实例。
     * @param  {string} type 事件类型。
     * @param  {ApplicationContextBase} context 应用程序上下文实例。
     */
    public ApplicationEventArgs(String type, ApplicationContextBase context) {
        super(type, null);

        this.context = context;
    }

	/**
	 * @return the context
	 */
	public ApplicationContextBase getContext() {
		return context;
	}

}